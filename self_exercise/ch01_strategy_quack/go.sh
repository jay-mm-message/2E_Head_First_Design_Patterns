
rm ./class/*.class
javac *.java -d ./class/

java -cp ./class MiniDuckSimulator

echo "Waitting for UML diagram generation..."
java -jar ../UMLParserClass.jar ../ch01_strategy_quack strategy_uml
