if [ -d class ]
then
  echo "rm class"
  rm -rf class
fi

javac -d ./class *.java
java -cp ./class ch02_observer_class.TestClassTimeNotify
echo ""
echo "Waitting for UML diagram generation..."
java -jar ../UMLParserClass.jar ../ch02_observer_class TestClassTimeNotify_uml
