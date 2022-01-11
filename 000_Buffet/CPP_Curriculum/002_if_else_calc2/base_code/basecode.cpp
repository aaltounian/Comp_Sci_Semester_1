// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"first number: "<<endl;
	int num1;
	cin>>num1;
	cout<<"second number: "<<endl;
	int num2;
	cin>>num2;
	cout<<"operation (+,-,/,*):  "<<endl;
	char op;
	cin>>op;
	char op1='+';
	char op2='-';
	char op3='/';
	char op4='*';
	
	if(op==op1){
	int num3=num1+num2;
	cout<<"the answer is: "<<num3<<endl;
	}
	
	if(op==op2){
	int num3=num1-num2;
	cout<<"the answer is: "<<num3<<endl;
	}
	
	if(op==op3){
	int num3=num1/num2;
	cout<<"the answer is: "<<num3<<endl;	
	}
	
	if(op==op4){
	int num3=num1*num2;
	cout<<"the answer is: "<<num3<<endl;	
	}

}
