FROM gradle:8.4-jdk17
COPY . /home/tests
WORKDIR /home/tests
RUN gradle dependencies
CMD ["gradle", "clean", "test"]

