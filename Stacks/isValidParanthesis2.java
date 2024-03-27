// package Stacks;

// public class isValidParanthesis2 {
//     // public Boolean isValid(String s)
//     // {
//     // int i=-1;
//     // int arr[] = new int[s.length()];
//     // for(char c:s.toCharArray())
//     // {
//     // if(c=='('||c=='{'||c=='[')
//     // {
//     // arr[++i]=c;
//     // }
//     // else{
//     // if(i>=0&&((c==')'&&arr[i]=='(')||(c=='}'&&arr[i]=='{')||(c==']'&&arr[i]=='[')))
//     // i--;
//     // else
//     // return false;

//     // }
//     // }
//     // return i==-1;

//     // working
//     char stack[] = new char[s.length()];
//     int i = -1;
//     for(char a:s.toCharArray())
//     {
//         if (a == '{' || a == '(' || a == '[')
//             stack[++i] = a;
//         else {
//             if (i >= 0 && ((a == '}' && stack[i] == '{') || (a == ')' && stack[i] == '(')
//                     || (a == ']' && stack[i] == '['))) {
//                 i--;
//             } else {
//                 return false;
//             }
//         }
//     }return i==-1;

//     // return i==-1;
// }

// }
