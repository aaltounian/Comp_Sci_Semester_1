// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	cout<<"symbol: "<<endl;
	char sym;
	cin>>sym;
	cout<<"length: "<<endl;
	int length;
	cin>>length;
	cout<<"horizontal or vertical or diagonal (h or v or d): "<<endl;
	char hv;
	cin>>hv;
	char h='h';
	char v='v';
	char d='d';
	
	if(hv==h)
	{
		int num;
		for(num=1;num<length+1;num++){
			cout<<sym;
		}
	}
	
	if(hv==v)
	{
		int num;
		for(num=1;num<length+1;num++){
			cout<<sym<<endl;
		}
	}
	
	if(hv==d)
	{
		int num;
		for(num=1;num<length+1;num++){
			gotoxy(num,10+num);
			cout<<sym<<endl;
		}
	}
	

}
