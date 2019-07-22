import java.util.Scanner;
public class CalculoSalario
{
  public static void main(String[] args)
  {
    double sal=0,fes=0,stot=0,ex=0,hex=0,hhex=0,sld=0,sol=0,ispt=0,t=0,pen=0,p=0;
    int h=0;
    String res;
    Scanner std=new Scanner(System.in);

    System.out.println("Introduzca su salario por dia");
    sal=std.nextDouble();
    std.nextLine();
    System.out.println("Trabajaste durante alguno de estos dias en este periodo laboral?:");
    System.out.println("Primero de enero,\nel primer lunes de febrero,\nel tercer lunes de marzo,\nel primero de mayo,\nel 16 de septiembre,\nel 25 de diciembre");
    res=std.nextLine();
    if (res.equalsIgnoreCase("si"))
    {
      fes=sal*3;
      stot=sal+fes;
      System.out.println("Trabajaste horas extra en este periodo laboral");
      res=std.nextLine();
      if (res.equalsIgnoreCase("si"))
      {
        System.out.println("Introduce cuantas horas extra trabajaste");
        h=std.nextInt();
        hex=sal/8;
        hhex=2*hex;
        ex=hhex*h;
        stot=stot+ex;
      }
      System.out.printf("Tu salario con bonos sera de: %.2f%n",stot);
    }
    else
    {
      stot=sal;
      System.out.println("Trabajaste horas extra en este periodo laboral");
      res=std.nextLine();
      if (res.equalsIgnoreCase("si"))
      {
        System.out.println("Introduce cuantas horas extra trabajaste");
        h=std.nextInt();
        hex=sal/8;
        ex=2*((hex*h));
        stot=stot+ex;
      }
      System.out.printf("Tu salario con bonos sera de: %.2f%n",stot);
    }
    sld=sal*.04;
    stot=stot-sld;
    System.out.printf("Se te cobrara $%.2f de salud%n",sld);
    pen=sal*.04;
    stot=stot-pen;
    System.out.printf("Se te cobrara $%.2f de pension%n",pen);
    sol=sal*.01;
    stot=stot-sol;
    System.out.printf("Se te cobrara $%.2f del fondo de solidaridad pensional%n",sol);
    if (sal<=0)
    {
      ispt=sal*0;
      stot=t;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=.01 && sal<=496.07)
    {
      ispt=sal*.0192;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=496.08 && sal<=4210.41)
    {
      ispt=sal*.064;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=4210.42 && sal<=7399.42)
    {
      ispt=sal*.1088;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=7399.43 && sal<=8601.50)
    {
      ispt=sal*.16;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=8601.51 && sal<=10298.38)
    {
      ispt=sal*.1792;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=10298.36 && sal<=20770.29)
    {
      ispt=sal*.2136;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=20770.30 && sal<=32736)
    {
      ispt=sal*.2352;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=32736.84 && sal<=62500)
    {
      ispt=sal*.3;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=62500.01 && sal<=83333.33)
    {
      ispt=sal*.32;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else if (sal>=83333.34 && sal<=250000.00)
    {
      ispt=sal*.34;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    else
    {
      ispt=sal*.35;
      t=stot-ispt;
      System.out.printf("Se te cobrara $%.2f de ISPT%n",ispt);
    }
    System.out.println("Pediste algun prestamo este periodo?");
    res=std.nextLine();
    if (res.equalsIgnoreCase("si"))
    {
      System.out.println("Introduce que cantidad fue tu prestamo");
      p=std.nextInt();
      t=t-p;
      System.out.printf("Tu salario neto sera de: $%.2f%n",t);
    }
    else
    {
      System.out.printf("Tu salario neto sera de: $%.2f%n",t);
    }

  }
}