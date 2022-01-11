// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	gotoxy(5,5);
	cout<<"$$$$$";
	gotoxy(5,6);
	cout<<"$   $";
	gotoxy(5,7);
	cout<<"$   $";
	gotoxy(5,8);
	cout<<"$   $";
	gotoxy(5,9);
	cout<<"$$$$$";

	while(true){
		gotoxy(1,15);
		cout<<"if you want another # press smth, if you wanna stop press q: ";
		char p=getch();
		if(p=='q'){
			break;
		}
		gotoxy(7,7);
		int x=random(9);
		cout<<x;
		
	}
	
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;
	cout<<endl;

}
