class emp
{
  int eno;
  String ename;
  float sal;
  emp()
  {
     eno=101;
     ename="om";
     sal=900350;
     System.out.println("Emp number="+eno);
     System.out.println("Emp name="+ename);
     System.out.println("Salary="+sal);
     eno=102;
     ename="sai";
     sal=987654;
     System.out.println("Emp number="+eno);
     System.out.println("Emp name="+ename);
     System.out.println("Salary="+sal);
  }
  public static void main(String arg[])
  {
     emp ob=new emp();
  }
}
