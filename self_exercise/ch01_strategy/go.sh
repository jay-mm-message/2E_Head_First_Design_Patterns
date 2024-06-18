
rm ./class/*.class
javac *.java -d ./class/

java -cp ./class MiniDuckSimulator
