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
	

	for(int num1=0;num1<l;num1++)
	{
		cout<<endl;
		for(int num2=0;num2<w;num2++)
		{
			cout<<s;
		}
	}
	

}
