### Scope

__________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

This application allows you to create a grammar that it's in CNF (Chomsky Normal Form)  and from it check if a given string input it's generated from it using CYK algorithm.

_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

### Instructions

_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________

1. Clone this repository into your eclipse work-space.

2. Import this repository into your eclipse IDE.

3. Run program from main

4. Once it is open, the GUI will be shown with the following elements:

   ![generalView(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/generalview(1).jpg)

   ![generalView(2)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/generalview(2).jpg)

   On screen you can see different tabs. The "Grammar" tab presents an interactive form where it is listed all necessary fields to create the grammar and add its production rules. The "CYK resume" tab presents the result of applying the CYK algorithm with an input string and the grammar it was created previously on the "Grammar" tab. 

   When you decide it is time to close the application you must click the "door out" icon.

5. Let's start by entering the main information for the grammar:

   ![createGrammar(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/createGrammar(1).jpg)

   ![createGrammar(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/createGrammar(2).jpg)

   ![createGrammar(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/createGrammar(3).jpg)

   ![createGrammar(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/createGrammar(4).jpg)

   ![createGrammar(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/createGrammar(5).jpg)

   In the first section, you must need to enter the following: 

   ​	The input string (a non empty string to be checked from the grammar and that it's required for the CYK algorithm) If you want to 	check the lambda symbol you must type "lambda".

   ​	The initial symbol (this specifies which is the first symbol that starts the production rules for the grammar. It's usually "S")

   ​	The set of terminals (this specifies which elements made up part of the terminals set for the grammar, separate each terminal by 	"," the program will do the rest. Remember "lambda" can be a terminal). 

   ​	The set of symbols (this specified which elements made up part of the symbols set for the grammar, separate each symbol by "," 	the program will do the rest)

   If everything is right you can click on the button "add" to start adding the production rules. Once added you cannot overwrite the information you entered, be careful!

6. To add production rules:

   ![addProductionRule(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/addProductionRule(1).jpg)

   ![addProductionRule(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/addProductionRule(2).jpg)

   ![addProductionRule(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/addProductionRule(3).jpg)

   ![addProductionRule(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/addProductionRule(4).jpg)

   In the second section, you must need to enter the head of the particular production you're adding, then in the body section you need to specify each body of the different productions rules (remember "lambda" can be a part of a body production). Look at the example above. You can add as much productions rules as the grammar contains,Once you have entered all your production rules you can now run the CYK algorithm.

7. To start the CYK algorithm:

   ![runCYKAlgorithm(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/runCYKAlgorithm(1).jpg)

   ![runCYKAlgorithm(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/runCYKAlgorithm(2).jpg)

   To run the CYK algorithm, you just need to press the button "Start CYK decision algorithm" once done, on the CYK resume tab you will see the results of the execution.

8. To start with a new Grammar:

   ![anotherGrammar(1)](https://github.com/backtojuan/GrammarProgram/blob/master/overview/anotherGrammar(1).jpg)

   Once you have created your grammar and added its production rules, you can choose if you want to add a new grammar, once you have run the algorithm over the data you entered the form is restablished again, so you can enter new information.