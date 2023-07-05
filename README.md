# Archetype for api 
To create a new service, use this archetype. In order to use archetype, navigate to root folder and install it using following command:

```bash
mvn clean install
```

Once the archetype is installed, navigate to the directory where the new neo service project needs to be created and execute following command (e.g. Content service):

```bash
mvn archetype:generate -DarchetypeGroupId=com.neo \
                       -DarchetypeArtifactId=archetype-neo-service \
                       -DarchetypeVersion=2.0-SNAPSHOT \
                       -DgroupId=com.neo \
                       -DartifactId=neo-service-content \
                       -Dversion=1.0.0-SNAPSHOT \
                       -DshortName=content \
                       -DclassPrefix=Content \
                       -DhelmServiceId=content-service
```
Note:\
__While choosing the names, following things to be considered.__
* `shortName` has to be in lower case. It is used in several files such as path of the controller path name.
* `classPrefix` is used in the name of the class. It should be camel cased.
