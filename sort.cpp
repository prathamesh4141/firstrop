#include<iostream>
#include<conio.h>
#include<fstream>
using namespace std;
int main()
{
	ofstream myfile("file.txt");
	ifstream inf("file.txt");
	int i,j,n,t;
	cout<<"Enter the array size";
	cin>>n;
	int a[n];
	cout<<"enter elements";
	for(i=0;i<n;i++)
	{
		cin>>a[i];
	}
	for(i=0;i<n;i++)
	{
		myfile<<"the elements are"<<a[i]<<endl;
	}
	for(i=1;i<n;i++)
    {
    	for(j=0;j<(n-i);j++)
    	{
    		if(a[j]>a[j+1])
    		{
    			t=a[j];
    			a[j]=a[j+1];
    			a[j+1]=t;
			}
		}
	}
	cout<<"the sorted array";
	for(j=0;j<n;j++)
	{
		cout<<endl<<a[j]<<"\n";
		myfile<<endl<<a[j];
	}
	myfile.close();
	string xyz;
	while(getline(inf,xyz))
	{
		cout<<xyz<<"\n";
	}
	inf.close();
	getch();
	return 0;
}

