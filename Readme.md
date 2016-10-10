# Docufier Maven Plugin 

Continuous integration: [![Build Status](https://travis-ci.org/programmiersportgruppe/docufier-plugin.svg)](https://travis-ci.org/programmiersportgruppe/docufier-plugin)


This plugin runs [docufier](https://github.com/programmiersportgruppe/docufier) as part of your
maven build to generate documentation from JUnit tests.

To get started you need to add the plugin to your maven build:

~~~ .xml
<build>
    <plugins>

        <plugin>
            <groupId>org.buildobjects</groupId>
            <artifactId>docufier-plugin</artifactId>
            <version>0.0.2</version>
            <executions>
                <execution>
                    <phase>generate-resources</phase>
                    <goals>
                        <goal>docufy</goal>
                    </goals>
                </execution>
            </executions>            
        </plugin>
    </plugins>
</build>
~~~

Per default the plugin tries to read test cases from `src/test/java` and writes to `target/doc`.

These directories can be configured by adding a configuration element to the plugin config:
 
~~~ .xml
<configuration>
    <outputDirectory>src/test/java</outputDirectory>
    <outputDirectory>target/md</outputDirectory>
</configuration>
~~~
