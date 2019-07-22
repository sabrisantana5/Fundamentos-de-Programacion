import	java.util.Scanner;
public	class	Determinantes
{
		public	static	void	main(String[]	args)
		{
				int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,n=0,detsis=0,x=0,y=0,z=0,det1=0,det2=0,x1=0,x2=0,y1=0,y2=0,z1=0,z2=0;
				double	res=0,res1=0,res2=0;
				Scanner	std=new	Scanner(System.in);
				System.out.println("De	que	tamanio	es	tu	sistema	de	ecuaciones	(2	o	3)");
				n=std.nextInt();
				int[][]det=new	int[n][n];
				if	(n==2)
				{
						int	[][]result=new	int	[2][1];
						System.out.println("Cuales	son	las	constantes	de	la	primera	ecuacion?	(presiona	enter entre	cada	valor)");
						a=std.nextInt();
						b=std.nextInt();
						c=std.nextInt();
						System.out.println("Cuales	son	las	constantes	de	la	segunda	ecuacion?	(presiona	enter entre	cada	valor)");
						d=std.nextInt();
						e=std.nextInt();
						f=std.nextInt();
						det	[0][0]=a;
						det	[0][1]=b;
						det	[1][0]=d;
						det	[1][1]=e;
						result	[0][0]=c;
						result	[1][0]=f;
						detsis=(det[0][0]*det[1][1])-(det[0][1]*det[1][0]);
						x=(result[0][0]*det[1][1])-(result[1][0]*det[0][1]);
						y=(result[1][0]*det[0][0])-(result[0][0]*det[1][0]);
						res=(double)x/(double)detsis;
						res1=(double)y/(double)detsis;
						System.out.printf("x	=	%.2f%n",res);
						System.out.printf("y	=	%.2f%n",res1);
				}
				else	if	(n==3)
				{
						int	[][]result=new	int	[3][1];
						System.out.println("Cuales	son	las	constantes	de	la	primera	ecuacion?	(presiona	enter entre	cada	valor)");
						a=std.nextInt();
						b=std.nextInt();
						c=std.nextInt();
						d=std.nextInt();
						System.out.println("Cuales	son	las	constantes de	la	segunda	ecuacion?	(presiona	enter entre	cada	valor)");
						e=std.nextInt();
						f=std.nextInt();
						g=std.nextInt();
						h=std.nextInt();
						System.out.println("Cuales	son	las	constantes	de	la	tercera	ecuacion?	(presiona	enter entre	cada valor)");
						i=std.nextInt();
						j=std.nextInt();
						k=std.nextInt();
						l=std.nextInt();
						det[0][0]=a;
						det[0][1]=b;
						det[0][2]=c;
						det[1][0]=e;
						det[1][1]=f;
						det[1][2]=g;
						det[2][0]=i;
						det[2][1]=j;
						det[2][2]=k;
						result	[0][0]=d;
						result	[1][0]=h;
						result	[2][0]=l;

det1=((det[0][0]*det[1][1]*det[2][2])+(det[1][0]*det[2][1]*det[0][2])+(det[2][0]*det[0][1]*det[1][2]));

det2=((det[1][0]*det[0][1]*det[2][2])+(det[0][0]*det[2][1]*det[0][2])+(det[2][0]*det[1][1]*det[0][2]));
						detsis=(det1-det2);

x1=((result[0][0]*det[1][1]*det[2][2])+(result[1][0]*det[2][1]*det[0][2])+(result[2][0]*det[0][1]*det[1][2]));

x2=((result[1][0]*det[0][1]*det[2][2])+(result[0][0]*det[2][1]*det[0][2])+(result[2][0]*det[1][1]*det[0][2]));
						x=(x1-x2);

y1=((det[0][0]*result[1][0]*det[2][2])+(det[1][0]*result[2][0]*det[0][2])+(det[2][0]*result[0][0]*det[1][2]));

y2=((det[1][0]*result[0][0]*det[2][2])+(det[0][0]*result[2][0]*det[0][2])+(det[2][0]*result[1][0]*det[0][2]));
						y=(y1-y2);

z1=((det[0][0]*det[1][1]*result[2][0])+(det[1][0]*det[2][1]*result[0][0])+(det[2][0]*det[0][1]*result[1][0]));

z2=((det[1][0]*det[0][1]*result[2][0])+(det[0][0]*det[2][1]*result[1][0])+(det[2][0]*det[1][1]*result[0][0]));
						z=(z1-z2);
						res=(double)x/(double)detsis;
						res1=(double)y/(double)detsis;
						res2=(double)z/(double)detsis;
						System.out.printf("x	=	%.2f%n",res);
						System.out.printf("y	=	%.2f%n",res1);
						System.out.printf("z	=	%.2f%n",res2);
				}
				else
				{
						System.out.println("No	aplica");
				}
		}
}
