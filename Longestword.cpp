
#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main(int argc, char const *argv[])
{
    string line;
    ifstream myfile (argv[0]);
	if (myfile.is_open())
	{
		while(getline(myfile,line))
		{
			//char l[2048];
			//strncpy(l,line.c_str());
			//find size of the 1st word..then second word
                int len=0;
                int position;
                int x=0;
			for (int i = 0; i < line.length(); i++)
			{
				
			
				if(isspace(line[i]))
				{
					if(len>x)
					{
						x=len;
						position=i-len;
					}
					len=0;

				}
				else
				{
					len++;
				}
			}
			for(int k=position;k<x;k++)
			{
				cout << line[k];
                //position++;
			}
            cout << "\n";
		}
		myfile.close();
	}
	return 0;
}