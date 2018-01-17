# springBoot-mybatis
a spring-boot with mybatis basic demo


## install

idea import maven project

## configure

spring-boot 入口
`src/java/com/example/demo/DemoApplication`

程序主要配置文件
`src/resources/application.properties`

mybatis mapper
`src/resources/mybatis/*`




## build

`mvn package`

## build without tests

`mvn package -Dmaven.test.skip=true`

## run

`java -jar path/to/jar.jar`
