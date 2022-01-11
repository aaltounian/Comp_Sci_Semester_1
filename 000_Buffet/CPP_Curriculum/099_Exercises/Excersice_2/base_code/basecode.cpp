// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	cout<<"what would you like the snowflake to be: "<<endl;
	char snow;
	cin>>snow;
	
	for(int a=0;a<10;a++){
		gotoxy(5,5+a);
		cout<<snow<<endl;
		sleep(1);
		gotoxy(5,5+a);
		cout<<" "<<endl;
	}

}
