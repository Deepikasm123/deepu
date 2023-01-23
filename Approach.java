class Approach
{
public static void main(String[] args)
{
int count;
for(int i=1;i<=5;++i)
{
count=5;
for(int j=1;j<=5-i+1;++j)
{
System.out.print(count--);
}
System.out.println();
}
}
}
