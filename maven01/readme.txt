pom.xml������struts-core��jar���е�maven���ҵ���
��.<modelVersion>��maven�汾��
��.<groupId>����Ŀ�İ�����
��.<artifactId>��ģ������
��.<version>��0.0.1SNAPSHOT���հ汾
��cmd��������Ŀ�����Ƚ�����Ŀ����ŵ�Ŀ¼��
��mvn compile ����������Դ���룬�������testĿ¼��Դ���롣��һ������ʱ����������ص������������ܻ�ȽϷ�ʱ
��mvn test ����Ӧ�ó����еĵ�Ԫ����
������target�ļ��У������������ֽ����ļ���classes���棬���Գ������test-classes�£�surefire-reports�ļ����������ǵ������ɵĲ��Ա���
��mvn package ����targetĿ¼������һ��maven01-model-0.0.1SNAPSHPT.jar
-----------------

mavenĿ¼�ṹ��src
                  -main
                       -java
                            -package
                  -test
                       -java
                            -package

-------------------------------------

1. mvn -v �汾��
2. mvn compile ���롣
3. mvn test ���ԡ�
4. mvn package �����
5. mvn clean ���maven���ɵ�targetĿ¼��
6. mvn install �����ɵ�jar��װ�����زֿ��С�