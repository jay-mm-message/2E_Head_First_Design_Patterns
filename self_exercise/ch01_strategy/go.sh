
rm ./class/*.class
javac *.java -d ./class/

java -cp ./class MiniDuckSimulator
java -jar ../UMLParserClass.jar ../ch01_strategy strategy_uml
