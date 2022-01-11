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
	cout<<"horizontal or vertical (h or v): "<<endl;
	char hv;
	cin>>hv;
	char h='h';
	char v='v';
	
	if(hv==h)
	{
		int num;
		for(num=0;num<length;num++){
			cout<<sym;
		}
	}
	
	if(hv==v)
	{
		int num;
		for(num=0;num<length;num++){
			cout<<sym<<endl;
		}
	}

}
