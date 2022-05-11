Числови изрази / Numerical Expressions
======================================

Примери / Examples
------------------
* 42
* 40 + 2
* 22 - 1 * 2
* (22 - 1) * 2
* 85 / 2
* 85.0 / 2
* 85 / 2.0

Променливи
----------
* var a = 42
* var a = _<израз>_
* var b = a * a

Всичко, което правихме в jshell досега се свежда до пресмятане на числени изрази. (Evaluating number expressions).
Също така видяхме, че java прави разлика между цели числа и числа с десетична точка (докато в javascript такава разлика не се прави).
С това типовете данни (респективно - изрази) в java далеч не свършват.

Логически (/ Булеви / Boolean) изрази, Булева алгебра
-------------------------------------
> Boolean algebra was introduced by George Boole in his first book The Mathematical Analysis of Logic (1847),
> and set forth more fully in his An Investigation of the Laws of Thought (1854).
> Boolean algebra has been fundamental in the development of digital electronics,
> and is provided for in all modern programming languages. It is also used in set theory and statistics.

В Булевия тип има само два вида стойности - **true** (истина/вярно) и **false** (лъжа/невярно)
и няколко операции, върху тези стойности. Най-известните са следните операции:

+ **&&** - **AND**/**И**/конюнкция
+ **||** - **OR**/**ИЛИ**/дизюнкция
+ **!**  - **NOT**/**НЕ**/отрицание

Ето няколко примера за тези операции (на естествен език):
+ Ако _(утре приключа работа преди 12)_ **И** _(времето е хубаво)_ ... може да се разходим в парка.
+ Ако _(в аптечката нямаме аспирин)_ **ИЛИ** _(срокът му на годност е изтекъл)_ ... е добре да купиш аспирин.
+ Ако **НЕ** _(успея да ти се обадя сутринта)_ **И** _(ситуацията го позволява)_ ... ще гледам да ти се обадя следобед.

По-формалния вид на горните изрази е:
+ X **AND** Y
+ X **OR** Y
+ **NOT** X **AND** Y


| AND |  0  |  1    
|-----|-----|----
|**0**|  0  |  0
|**1**|  0  |  1


| OR  |  0  |  1    
|-----|-----|----
|**0**|  0  |  1
|**1**|  1  |  1


| X   | NOT X
|-----|-------
|**0**| &nbsp;&nbsp; 1
|**1**| &nbsp;&nbsp; 0


Алтернативна таблица (all-in-one table):

|   X   |   Y   |X AND Y|X OR Y| NOT X
|-------|-------|-------|------|------
| false | false | false | false| true
| false | true  | false | true | true
| true  | false | false | true | false
| true  | true  | true  | true | false


Булевите изрази и операции между тях не биха били много полезни, ако нямаше 'мост' който свързва другите типове данни с тях.
Аритметичните операции например дават в резултат числo, но можем да сравним две числа посредством някоя от операциите за сравнение на числа и да получим булева стойност:

| Израз |  Тип  | Стойност |
|-------|-------|----------|
| 5 + 3 |  int  | 8 (число)
| 5 < 3 |boolean| false
| 5 <= 3|boolean| false
| 5 > 3 |boolean| true
| 5 >= 3|boolean| true
| 5 == 3|boolean| false
| 5 != 3|boolean| true

Приоритет на логическите оператори
----------------------------------
Разширяваме таблицата с приоритети до:
1. (префиксни) __!__ и __-__
2. __*__ и __/__
3. __+__ и __-__
4. __&lt;__, __&lt;=__, __&gt;__ и __&gt;=__
4. __&&__
5. __||__
6. __==__ и __!=__

<table border="1" cellpadding="5" summary="This table lists operators according to precedence order">
<caption id="nutsandbolts-precedence"><strong>Operator Precedence</strong></caption>
<tbody><tr>
<th id="h1">Operators</th>
<th id="h2">Precedence</th>
</tr>
<tr>
<td headers="h1">postfix</td>
<td headers="h2"><code><em>expr</em>++ <em>expr</em>--</code></td>
</tr>
<tr>
<td headers="h1">unary</td>
<td headers="h2"><code>++<em>expr</em> --<em>expr</em> +<em>expr</em> -<em>expr</em> ~ !</code></td>
</tr>
<tr>
<td headers="h1">multiplicative</td>
<td headers="h2"><code>* / %</code></td>
</tr>
<tr>
<td headers="h1">additive</td>
<td headers="h2"><code>+ -</code></td>
</tr>
<tr>
<td headers="h1">shift</td>
<td headers="h2"><code>&lt;&lt; &gt;&gt; &gt;&gt;&gt;</code></td>
</tr>
<tr>
<td headers="h1">relational</td>
<td headers="h2"><code>&lt; &gt; &lt;= &gt;= instanceof</code></td>
</tr>
<tr>
<td headers="h1">equality</td>
<td headers="h2"><code>== !=</code></td>
</tr>
<tr>
<td headers="h1">bitwise AND</td>
<td headers="h2"><code>&amp;</code></td>
</tr>
<tr>
<td headers="h1">bitwise exclusive OR</td>
<td headers="h2"><code>^</code></td>
</tr>
<tr>
<td headers="h1">bitwise inclusive OR</td>
<td headers="h2"><code>|</code></td>
</tr>
<tr>
<td headers="h1">logical AND</td>
<td headers="h2"><code>&amp;&amp;</code></td>
</tr>
<tr>
<td headers="h1">logical OR</td>
<td headers="h2"><code>||</code></td>
</tr>
<tr>
<td headers="h1">ternary</td>
<td headers="h2"><code>? :</code></td>
</tr>
<tr>
<td headers="h1">assignment</td>
<td headers="h2"><code>= += -= *= /= %= &amp;= ^= |= &lt;&lt;= &gt;&gt;= &gt;&gt;&gt;=</code></td>
</tr>
</tbody></table>
