// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	cout<<"width: "<<endl;
	int w;
	cin>>w;
	cout<<"symbol: "<<endl;
	char s;
	cin>>s;
	cout<<"length: "<<endl;
	int l;
	cin>>l;
	cout<<"x coordinate: "<<endl;
	int x;
	cin>>x;
	cout<<"y coordinate: "<<endl;
	int y;
	cin>>y;

	
	for(int num1=0;num1<l;num1++)
	{
	cout<<endl;
		for(int num2=0;num2<w;num2++)
		{
			gotoxy(x+num1,y+num2+13);
			cout<<s;
		}
	}
	

}
