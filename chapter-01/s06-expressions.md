Числови изрази / Numerical Expressions
======================================

Числа и прости числови изрази
---------------------
* 42
* 40 + 2
* 22 - 1 * 2
* (22 - 1) * 2
* 85 / 2 (!)
* 85.0 / 2
* 85 / 2.0

По-сложни числови изрази
------------------------
* 24 * 60 * 60
* 365 * 24 * 60 * 60
* 22 - 1 * 2
* (22 - 1) * 2
* 2 * (1 + 2 + 3 * 4) / 5
* b * c * sin(alpha) / 2
* 85 / 2.0

Променливи
----------
Променливата е начин да именуваме някаква получена стойност,
така че по-късно да можем да се обърнем отново към тази стойност по име (даденото ѝ име).  
Това именуване се нарича декларация/дефиниция (declaration/definition):
* var a = 42
* var b = 85.0 / 2
* var c = a + 2 * b
* var d = a * b - 1

Променливите имат и други важни аспекти - като например _scope_ и (поне в Java) _тип_.  
_Scope_ е частта от програмния код, в който е видимо даденото име/промемлива.  
_Тип_ е типа на стойностите, който тази променлива може да съдържа (int, double, boolean etc.)

Каноничния начин за деклариране на променливи в Java
----------------------------------------------------
към който ще се придържаме е вместо **var** да пишем типа на променливата:
* **int** a = 42;
* **double** b = 85.0 / 2;
* **double** c = a + 2 * b;
* **double** d = a * b - 1;

Дефиниране на променлива с **var** се допуска, само когато израза, с който я инициализираме (това, което седи отдясно на знака **=**) определя типа по недвусмислен, направо _очеваден_ начин.

Други типове изрази
===================

Всичко, което правихме с jshell досега бе пресмятане на числени изрази (Evaluating number expressions). 
Също така видяхме, че java прави разлика между цели числа и числа с десетична точка (докато в javascript такава разлика не се прави толкова отчетливо).  
С това обаче типовете данни (респективно - изрази) в java далеч не свършват.

Може ли да сравняваме числа програмно вместо 'на ръка'?
-------------------------------------------------------
Да, може. Ето така например:
* 42 < 42.0 
* 42 < 85 / 2
* a < b
* a >= b

Операторите за сравнение са: < &nbsp; <= &nbsp; > &nbsp; >= &nbsp; != &nbsp; ==  
От всяка страна на оператор за сравнение може да седи както константа (литерал), така и израз. 
Операторите за сравнение имат приоритет (precedence) по-нисък от този на аритметичните оператори.

Сравнявайки два числови израза, получаваме не число, а булева стойност - **true** или **false**  
(Но дори и с това различните видове стойности в Java/Javascript не се изчерпват).

Логически (/ Булеви / Boolean) изрази, Булева алгебра
-----------------------------------------------------
> Boolean algebra was introduced by George Boole in his first book The Mathematical Analysis of Logic (1847),
> and set forth more fully in his An Investigation of the Laws of Thought (1854).
> Boolean algebra has been fundamental in the development of digital electronics,
> and is provided for in all modern programming languages. It is also used in set theory and statistics.

В Булевия тип има само две различни стойности - **true** (истина/вярно/1) и **false** (лъжа/невярно/0)  
и няколко операции, върху тези стойности. Най-известните са тези:

+ **&&** - **AND**/**И**/конюнкция
+ **||** - **OR**/**ИЛИ**/дизюнкция
+ **!**  - **NOT**/**НЕ**/отрицание

Ето няколко примера за тези операции (на естествен език):
+ Ако _(утре приключа работа преди 12)_ **И** _(времето е хубаво)_ ... може да се разходим в парка.
+ Ако _(в аптечката нямаме аспирин)_ **ИЛИ** _(срокът му на годност е изтекъл)_ ... е добре да купиш аспирин.
+ Ако **НЕ** _(успея да ти се обадя сутринта)_ **И** _(ситуацията го позволява)_ ... ще гледам да ти се обадя следобед.

По-формалния вид на горните изрази е:
+ X **&&** Y  (X **AND** Y)
+ X **||** Y  (X **OR** Y)
+ !X **&&** Y  (**NOT** X **AND** Y)

<details>
  <summary>Таблици на истинността на <b>AND</b>, <b>OR</b> и <b>NOT</b>:</summary>

|X AND Y|  0  |  1    
|-------|-----|----
| **0** |  0  |  0
| **1** |  0  |  1


|X OR Y|  0  |  1    
|------|-----|----
|**0** |  0  |  1
|**1** |  1  |  1


| X   | NOT X
|-----|-------
|**0**| &nbsp;&nbsp; 1
|**1**| &nbsp;&nbsp; 0
</details>

<details>
  <summary>Алтернативна таблица (all-in-one table):</summary>

|   X   |   Y   |X AND Y|X OR Y| NOT X
|-------|-------|-------|------|------
|   0   |   0   |   0   |   0  |   1 
|   0   |   1   |   0   |   1  |   1 
|   1   |   0   |   0   |   1  |   0  
|   1   |   1   |   1   |   1  |   0  
</details>

Булевите изрази и операции между тях не биха били много полезни, ако нямаше 'мост' който свързва другите типове данни с тях.  
<details>
  <summary>Именно операциите за сравнение са този 'мост'</summary>

| Израз |  Тип  | Стойност |
|-------|-------|----------|
| 5 + 3 |  int  | 8 (число)
| 5 < 3 |boolean| false
| 5 <= 3|boolean| false
| 5 > 3 |boolean| true
| 5 >= 3|boolean| true
| 5 == 3|boolean| false
| 5 != 3|boolean| true
</details>

Приоритет на операторите
------------------------
<details>
  <summary>Приоритет на операторите, срещнати дотук</summary>

1. (префиксни) __!__ и __-__
2. __*__ и __/__
3. __+__ и __-__
4. __&lt;__, __&lt;=__, __&gt;__ и __&gt;=__
5. __==__ и __!=__
6. __&&__
7. __||__
</details>
 
<details>
  <summary>Приоритети на всички оператори в Java</summary>

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

</details>