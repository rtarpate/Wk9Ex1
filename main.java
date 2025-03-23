
public class main(String[] args)
{
    //creates Scanner
    Scanner myObj = new Scanner(System.in);

    //decalvers variables
    int pricipal;
    double irates;
    int loantime;
    int totalinterest;


    //promt user inputs
    System.out.println("What is the Pricipal amount of the loan");
    //collect user input
    pricipal = Ineger.parseInt(myObj.nextLine());

    //promt user inputs
    System.out.println("What is the interest rate (input in decmials)");
    //collect user input
    irates = Double.parseDouble(myObj.nextLine());

    //promt user inputs
    System.out.println("What is time of the laon in years");
    //collect user input
    loantime = Ineger.parseInt(myObj.nextLine());


    //caluateas the total interest
    totalinterest = pricipal * irates * loantime;


    //promt user inputs
    System.out.println("the total intreset of the loan is: " + totalinterest);
