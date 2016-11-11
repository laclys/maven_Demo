pom.xml：（从struts-core的jar包中的maven中找到）
①.<modelVersion>：maven版本。
②.<groupId>：项目的包名。
③.<artifactId>：模块名。
④.<version>：0.0.1SNAPSHOT快照版本
在cmd中运行项目：（先进入项目所存放的目录）
①mvn compile 编译主程序源代码，不会编译test目录的源代码。第一次运行时，会下载相关的依赖包，可能会比较费时
②mvn test 运行应用程序中的单元测试
会生成target文件夹，主程序编译的字节码文件在classes下面，测试程序放在test-classes下，surefire-reports文件夹下面存放是的所生成的测试报告
③mvn package 会在target目录下生成一个maven01-model-0.0.1SNAPSHPT.jar
-----------------

maven目录结构：src
                  -main
                       -java
                            -package
                  -test
                       -java
                            -package

-------------------------------------

1. mvn -v 版本。
2. mvn compile 编译。
3. mvn test 测试。
4. mvn package 打包。
5. mvn clean 清除maven生成的target目录。
6. mvn install 将生成的jar安装到本地仓库中。