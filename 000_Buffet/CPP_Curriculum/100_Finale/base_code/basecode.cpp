// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	
	
	for(int num1=0;num1<20;num1++)
	{
		for(int num2=0;num2<5;num2++)
		{
			gotoxy(25+num1,5+num2);
			cout<<"$";
		}
	}
	
	for(int num1=0;num1<20-2;num1++)
	{
		for(int num2=0;num2<5-2;num2++)
		{
			gotoxy(25+num1+1,5+num2+1);
			cout<<" ";
		}
	} 
	
	gotoxy(27,7);
	cout<<"MERRY CHRISTMAS!";

	gotoxy(0,10);
	cout<<"                             ___________                                       "<<endl;
	gotoxy(0,11);
	cout<<"                            /           \\                                     "<<endl;
	gotoxy(0,12);
	cout<<"                           |   *     *   |           /\\                       "<<endl;
	gotoxy(0,13);
	cout<<"                           |    \\___/    |          /o \\                     "<<endl;
	gotoxy(0,14);
	cout<<"                            \\___________/          /o_o_\\                    "<<endl;
	gotoxy(0,15);
	cout<<"                            /           \\           | |                       "<<endl;
	gotoxy(0,16);
	cout<<"                           /             \\                                    "<<endl;
	gotoxy(0,17);
	cout<<"              /\\          |               |                      ☆           "<<endl;
	gotoxy(0,18);
	cout<<"             / o\\          \\             /                       /\\         "<<endl;
	gotoxy(0,19);
	cout<<"            / o  \\          \\___________/                       /0 \\        "<<endl;
	gotoxy(0,20);
	cout<<"           /   o  \\         /           \\                      /   o\\       "<<endl;
	gotoxy(0,21);
	cout<<"          /_o____o_\\       /             \\                    /  o   \\      "<<endl;
	gotoxy(0,22);
	cout<<"             |  |         /               \\                  / O    o \\      "<<endl;
	gotoxy(0,23);
	cout<<"                         |                 |                / o    O   \\      "<<endl;
	gotoxy(0,24);
	cout<<"                          \\               /                / 0   O   0  \\    "<<endl;
	gotoxy(0,25);
	cout<<"                           \\             /                /__O_____0__o__\\   "<<endl;
	gotoxy(0,26);
	cout<<"                            \\-----------/                      |     |        "<<endl;
	gotoxy(0,27);


	while(true){
		int x=random(9);
		gotoxy(23,7);
		cout<<x;
		gotoxy(46,7);
		cout<<x;
	}

}
