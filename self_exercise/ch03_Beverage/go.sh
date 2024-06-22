if [ -d class ]
then
  echo "rm class"
  rm -rf class
fi

javac -d ./class *.java
java -cp ./class ch03_Beverage.StarbucksStore
echo ""
echo "Waitting for UML diagram generation..."
java -jar ../UMLParserClass.jar ../ch03_Beverage StarbucksStore_uml
