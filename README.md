#[Classy](http://acmicpc-pacnw.org/ProblemSet/2015/Statements/div1.pdf)

Division I ACM ICPC programming problem.

##Problem

In his memoir So, Anyway. . . , comedian John Cleese writes of the class difference between his father
(who was “middle-middle-middle-lower-middle class”) and his mother (who was “upper-upperlower-middle
class”). These fine distinctions between classes tend to confuse American readers, so
you are to write a program to sort a group of people by their classes to show the true distinctions.
There are three main classes: upper, middle, and lower. Obviously, upper class is the highest,
and lower class is the lowest. But there can be distinctions within a class, so upper-upper is a
higher class than middle-upper, which is higher than lower-upper. However, all of the upper classes
(upper-upper, middle-upper, and lower-upper) are higher than any of the middle classes.
Within a class like middle-upper, there can be further distinctions as well, leading to classes
like lower-middle-upper-middle-upper. When comparing classes, once you’ve reached the lowest
level of detail, you should assume that all further classes are the equivalent to the middle level of
the previous level of detail. So upper class and middle-upper class are equivalent, as are middlemiddle-lower-middle
and lower-middle.

###Input
---
The first line of input contains n (1 ≤ <em>n</em> ≤ 1,000), the number of names to follow. Each of the
following <em>n</em> lines contains the name of a person (a sequence of 1 or more lowercase letters ‘z’–‘z’),
a colon, a space, and then the class of the person. The class of the person will include one or more
modifiers and then the word class. The colon, modifiers, and the word class will be separated
from each other by single spaces. All modifiers are one of upper, middle, or lower. It is guaranteed
that the input is well-formed. Additionally, no two people have the same name. Input lines are no
longer than 256 characters.

###Output
---
Print the <em>n</em> names, each on a single line, from highest to lowest class. If two people have equivalent
classes, they should be listed in alphabetical order by name.

###Sample Input
---
<table>
  <tr>
    <th><big>Sample Input</big></th>
    <th>Sample Output</th>
  </tr>
  <tr>
    <td width="500px">
    5
    <br><samp>mom: upper upper lower middle class</samp>
    <br><samp>dad: middle middle lower middle class</samp>
    <br><samp>queenelizabeth: upper upper class</samp>
    <br><samp>chair: lower lower class</samp>
    <br><samp>unclebob: middle lower middle class</samp>
    </td>
    <td width="500px">
    <samp>queenelizabeth</samp>
    <br><samp>mom</samp>
    <br><samp>dad</samp>
    <br><samp>unclebob</samp>
    <br><samp>chair</samp>
    </td>
  </tr>
</table>

<table>
  <tr>
    <th><big>Sample Input</big></th>
    <th>Sample Output</th>
  </tr>
  <tr>
    <td width="500px">
    10
    <samp><br>rich: lower upper class</samp>
    <br><samp>mona: upper upper class</samp>
    <br><samp> dave: middle lower class</samp>
    <br><samp>charles: middle class</samp>
    <br><samp> tom: middle class</samp>
    <br><samp> william: lower middle class</samp>
    <br><samp> carl: lower class</samp>
    <br><samp> violet: middle class</samp>
    <br><samp> frank: lower class</samp>
    <br><samp> mary: upper class</samp>
    </td>
    <td width="500px">
    <samp>mona
    <samp><br>mary</samp>
    <br><samp>rich</samp>
    <br><samp>charles</samp>
    <br><samp>tom</samp>
    <br><samp>violet</samp>
    <br><samp>william</samp>
    <br><samp>carl</samp>
    <br><samp>dave</samp>
    <br><samp>frank</samp>
    </td>
  </tr>
</table>

##Solution

The techniques required to solve this problem consist of: string manipulation, string comparison, and implementing [Comparator](https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html) objects.

###General Idea



---
2015 Pacific Northwest Region Programming Contest—Division 1 
