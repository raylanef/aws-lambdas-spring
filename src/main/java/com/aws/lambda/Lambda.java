package com.aws.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Lambda implements Function<Request, Response> {

    @Override
    public Response apply(Request request) {
        String idCliente = request.getIdCliente();
        List<Contrato> contratos = request.getContratos();
        double desconto = request.getDesconto();
        List<Contrato> baixaPorParcela = new ArrayList<>();

        contratos.sort(Comparator.comparingDouble(Contrato::getValor));
        String idParcelaMaisBaixa = contratos.get(0).getId();
        String idParcelaMaisAlta = contratos.get(contratos.size() - 1).getId();
        double saldoDevedorMensal = contratos.stream().mapToDouble(Contrato::getValor).sum();

        double descontoTotal = desconto;
        for (Contrato contrato : contratos) {
            double valor = contrato.getValor();
            if (valor < descontoTotal) {
                baixaPorParcela.add(new Contrato(contrato.getId(), valor));
                descontoTotal -= valor;
            } else {
                baixaPorParcela.add(new Contrato(contrato.getId(), descontoTotal));
                break; // The remaining discount has been fully applied.
            }
        }

        return new Response(200, idCliente, contratos.size(), idParcelaMaisBaixa, idParcelaMaisAlta,
                baixaPorParcela, desconto, saldoDevedorMensal, desconto - saldoDevedorMensal,
                baixaPorParcela.size());

    }
}
