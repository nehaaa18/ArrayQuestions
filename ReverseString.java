class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        //char arr[]=str.toCharArray();
        String str2="";
        int length= str.length();
        for(int i=length-1;i>=0;i--)
        {
            str2+=str.charAt(i);
        }
        return str2;
    }
}
