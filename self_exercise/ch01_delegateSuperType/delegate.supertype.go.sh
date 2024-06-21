rm -rf ./class/
javac -d ./class/ ./*.java
java -cp ./class ch01_delegateSuperType.TestSuperType

echo "Waitting for UML diagram generation..."
java -jar ../UMLParserClass.jar ../ch01_delegateSuperType TestSuperType
