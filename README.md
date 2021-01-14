# Stone-like-Lang

### 简介
编译技术与应用课程实习项目。类Stone（StoneLike）语言及其解释器。包含一个手写的词法分析器、一套借助ANTLR实现的目标代码生成程序、一个运行目标代码的虚拟机以及一系列辅助类。
作者：<a href="https://github.com/leaf1170124460" target="_blank">leaf1170124460</a>、<a href="https://github.com/LUO12826" target="_blank">LUO12826</a>。

实习选题为类Stone语言（又称StoneLike）的解释器。类Stone语言从Stone语言中获得灵感。Stone语言为日本千叶滋教授用于讲解解释器设计的一种语言，Stone语言结构与面向对象编程语言较为相似。原始Stone语言中还包括了类与对象，本次实习仅选取Stone语言子集进行解释器的实现，不过对其部分语法进行了改进以更符合大多数程序员的习惯。

类Stone语言是一种解释型、动态类型、强类型的语言，没有类型标识符，使用者只需使用`var`或`const`关键字说明标识符是变量或常量。

类Stone语言具有以下基本语法成分：常量变量的声明和定义、赋值语句、算术和逻辑表达式、循环语句（while循环）、条件分支语句（if-else if-else语句）、函数（子程序）。类Stone程序语言支持以下数据类型：整型、浮点型、字符串、一维数组(引用类型，实际上在最终的实现中，数组是不定维度的，因为数组中的元素可以是数组）。布尔值（真、假）通过数值（非零、零）来表示。

类Stone语言也支持注释，注释放在“/*” “ */ ”之间，支持多行注释。



### 语句示例

类Stone语言的典型语句如下：

定义常量和变量。分别定义了两个具有数值初值的变量，一个值为字符串***"string literal"***的常量，和一个指向具有三个元素的数组的引用。

```swift
var v1 = 6
var v2 = 0
const c1 = "string literal"
var arr = [1, 2, 3]
```

赋值语句及算术表达式，以及按下标访问数组元素。

```swift
v2 = (v1 + v2) / 2
arr[2] = 4
```

函数定义和实现。定义并实现了一个接受三个参数，有返回值的函数。

```swift
func foo(para1, para2, para3) {
		return (para1 + para2) / para3
}
```

while循环语句和逻辑运算。

```swift
while v1 < 10 && v1 > 2 {
		v1 = v1 + 1
}
```

if-else条件分支语句。

```swift
if v2 < 10 {
		v2 = v2 + v1
}
else {
		v2 = v2 - v1
}
```



### 项目结构
```
Stone-like-Lang  
   ├──lib: 手动导入的Jar包，用于实现一些功能。  
   └── src  
        └── main  
            └── compiler  
                └── project  
                     ├── antlr: ANTLR生成的一些文件。  
                     ├── codegen: 与语义分析和中间代码生成相关的代码。  
                     ├── exception: 与词法分析和语法分析中错误处理相关的代码。  
                     ├── g4: StoneLike g4格式的语法文件。  
                     ├── helper: 提供辅助功能的代码。  
                     ├── io: 提供文件读入输出相关功能的代码。  
                     ├── lexer: 与词法分析有关的代码。  
                     ├── result: StoneLike测试代码编译后生成的目标代码。  
                     ├── test: StoneLike测试代码。  
                     └── vm: StoneLike虚拟机相关的代码。  
```


未列举的目录请忽略。  
