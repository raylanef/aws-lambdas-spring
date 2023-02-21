FROM amazonlinux:2
USER root
RUN yum -y update \
    && yum install -y tar unzip gzip bzip2-devel ed gcc gcc-c++ gcc-gfortran \
    less libcurl-devel openssl openssl-devel readline-devel xz-devel \
    zlib-devel glibc-static libcxx libcxx-devel llvm-toolset-7 zlib-static \
    && rm -rf /var/cache/yum

ENV JAVA_VERSION 17
ENV GRAAL_VERSION 22.3.0
ENV GRAAL_FOLDERNAME graalvm-ce-java${JAVA_VERSION}-${GRAAL_VERSION}
ENV GRAAL_FILENAME graalvm-ce-java${JAVA_VERSION}-linux-amd64-${GRAAL_VERSION}.tar.gz

RUN curl -4 -L https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-${GRAAL_VERSION}/${GRAAL_FILENAME} | tar -xvz
RUN mv $GRAAL_FOLDERNAME /usr/lib/graalvm
RUN rm -rf $GRAAL_FOLDERNAME

ENV MVN_VERSION 3.6.3
ENV MVN_FOLDERNAME apache-maven-${MVN_VERSION}
ENV MVN_FILENAME apache-maven-${MVN_VERSION}-bin.tar.gz

RUN curl -4 -L https://mirrors.ukfast.co.uk/sites/ftp.apache.org/maven/maven-3/${MVN_VERSION}/binaries/${MVN_FILENAME} | tar -xvz
RUN mv $MVN_FOLDERNAME /usr/lib/maven
RUN rm -rf $MVN_FOLDERNAME
RUN /usr/lib/graalvm/bin/gu install native-image
RUN ln -s /usr/lib/graalvm/bin/native-image /usr/bin/native-image
RUN ln -s /usr/lib/maven/bin/mvn /usr/bin/mvn
RUN ln -s /usr/lib/gradle/bin/gradle /usr/bin/gradle

ENV JAVA_HOME /usr/lib/graalvm

WORKDIR /project