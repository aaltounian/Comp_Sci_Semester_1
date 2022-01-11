// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	gotoxy(61,3);
	cout<<"___"<<endl;
	gotoxy(60,4);
	cout<<"/   \\"<<endl;
	gotoxy(59,5);
	cout<<"| 0 0 |"<<endl;
	gotoxy(59,6);
	cout<<"|  \\/ |"<<endl;
	gotoxy(60,7);
	cout<<"\\___/"<<endl;
	gotoxy(61,8);
	cout<<"| |"<<endl;
	gotoxy(57,9);
	cout<<"___/   \\___"<<endl;
	gotoxy(54,7);
	cout<<"\\";
	gotoxy(55,8);
	cout<<"\\";
	gotoxy(56,9);
	cout<<"\\";
	gotoxy(70,7);
	cout<<"/";
	gotoxy(69,8);
	cout<<"/";
	gotoxy(68,9);
	cout<<"/";
	gotoxy(71,7);
	cout<<"\\";
	gotoxy(53,7);
	cout<<"/";
	
	gotoxy(72,8);
	cout<<"\\";
	gotoxy(52,8);
	cout<<"/";
	
	gotoxy(73,9);
	cout<<"\\";
	gotoxy(51,9);
	cout<<"/";

	gotoxy();

}
