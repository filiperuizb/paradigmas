1 - Genealogianão é escada de progresso devido ao fato de uma linguagem mais nova não torna a anterior obsoleta, elas se cruzam e trocam influencias entre si. 
os exemplos históricos que sustentam essa afirmação é o fato de tanto o caso de sistemas serem caros de reescrever e reestruturar, quanto elas se especializarem por dominínio de atuação, mantendo conjunto de linguagens atuantes, mesmo surgindo "sucessoras" em outras áreas

4 - O projeto Fortran precisou convencer os programadores porque, na época, eles acreditavam que o código de máquina escrito à mão era mais rápido e eficiente. Havia desconfiança de que um compilador conseguiria gerar código com desempenho semelhante. O objetivo do Fortran era mostrar que o código traduzido poderia ser suficientemente rápido, principalmente em cálculos científicos. Ao mesmo tempo, programar em uma linguagem de alto nível era muito mais simples e rápido do que escrever diretamente em linguagem de máquina. Isso reduzia o custo e o tempo de desenvolvimento, além de facilitar a manutenção dos programas. Assim, mesmo que o código gerado não fosse sempre o mais eficiente possível, o ganho de produtividade compensava pequenas perdas de desempenho.

6 - Sua influência vêm de ideias que se tornaram fundamentais na programação.
Introduziu uma estrutura mais clara e organizada, com blocos e estruturas de controle, influenciando linguagens posteriores.
Além disso, ajudou a consolidar a recursão, permitindo que uma função chamasse a si mesma.
Por fim, seu desenvolvimento influenciou a notação e o projeto de linguagens, servindo de referência para linguagens como Pascal e C.

7- COBOL foi projetado para lidar com um publico comercial, sendo lido por pessoas que não eram programadores especialista, optando assim para atender à esse publico, uma linguagem mais verbosa aproximada do ingles, priorizando a legibilidade acima da concisão, representando uma abstração próxima da realidade dentro de seus registros. Sobre sua relação com FLOW-MATIC, ele herdou tanto os comandos inspirados em inglês, quanto a organização de dados em registros de maneira hierarquica.

10 - Ortogonalidade é a capacidade de pequenos conjuntos de construções primitivas serem organizadas de maneira livre, mantendo consistente e sem exessões arbitrárias. A referencia ao ALGOL 68 foi um caso que levou essa medida ao extremo, permitiu quase todas combinações de construções, mas isso à tornou conceitualmente pesada e de difícil aprendizado. Diante disso, ortogonalidade não reflete de maneira proporcional a dificuldade automaticamente.

14 - Em Smalltalk, tudo é objeto. Orientação a objetos é a essência da linguagem. C++ estende C, misturando procedural com orientado a objetos, ganhando compatibilidade com C mas perdendo pureza. Java simplifica em relação a C++ e prioriza portabilidade via JVM, permitindo rodar o mesmo código em qualquer plataforma.

15 - Java começou como o projeto Oak, pensado para rodar em eletrodomésticos e aparelhos embarcados . Só que esse mercado nunca decolou como esperado. Enquanto isso, a Web estava muito popular, e ela tinha exatamente o mesmo desafio estrutural: rodar em hardwares e sistemas diferentes sem controle sobre a máquina do usuário. A mesma solução técnica criada para aparelhos variados, a JVM, passou a resolver o problema dos navegadores variados. Isso mostra que mudanças de contexto reposicionam uma linguagem porque as características técnicas criadas para um problema original podem, por coincidência, servir a um problema novo que surge depois.

17- C# aproveitou características de C++ e Java, mas fez algumas escolhas para reduzir problemas de manutenção e dar maior controle ao programador, mantendo a linguagem adequada ao ambiente .NET.
Métodos não são virtuais por padrão em C#, diferentemente do Java, em que os métodos são virtuais por padrão. Em C#, é necessário declarar explicitamente um método como virtual para que ele possa ser sobrescrito. Essa decisão procura evitar sobrescritas acidentais e proporcionar maior controle sobre a evolução e o versionamento das classes. 
S
ScienceDirect
C# permite sobrecarga de operadores, como em C++, permitindo que operadores como +, - e == tenham comportamentos definidos para tipos criados pelo programador. A decisão procura tornar a utilização de determinados tipos mais natural e semelhante ao uso dos tipos básicos da linguagem, evitando operações pouco intuitivas. 
M
Microsoft Learn
+1


18-O XSLT recebe como entrada um documento de dados XML e um documento XSLT, que também é especificado na forma de XML. Durante o processamento, o processador XSLT encontra os templates que correspondem aos dados do documento XML e aplica as instruções de transformação definidas nesses templates. Como saída, é produzido outro documento, que pode ser XML, HTML ou texto puro. O JSP, por sua vez, recebe um documento JSP, normalmente uma mistura de HTML e Java. Quando esse documento é solicitado por um navegador, o processador JSP o converte em um servlet. O código Java é copiado para o servlet, enquanto o HTML puro é transformado em sentenças de impressão Java. A marcação JSTL também é processada. Depois, o servlet é executado pelo servlet container, e a saída é um documento HTML, retornado ao navegador. XSLT e JSP podem ser consideradas linguagens híbridas de marcação-programação porque, além da marcação, possuem recursos para controlar o processamento. No XSLT, existem construções como templates, iteração e ordenação, além de operações semelhantes às de programação. No JSP/JSTL, existem elementos de ação como if, choose, when, otherwise e forEach, que permitem controlar como o documento de saída será construído.

19-

FORTRAN (1957)
↓ influenciou o desenvolvimento de linguagens posteriores, principalmente na computação científica
ALGOL 60 (1960)
↓ influenciou a estrutura sintática e conceitos de linguagens imperativas posteriores
C (1972)
↓ influenciou linguagens posteriores pela sintaxe e pelo modelo de programação imperativa
C++ (1985)
↓ estendeu C com recursos de orientação a objetos
Java (1995)
↓ recebeu forte influência da sintaxe e dos conceitos de C/C++ e popularizou a orientação a objetos
JavaScript (1995)
↓ incorporou conceitos de programação funcional e orientação a objetos
Python (1991)
↓ combinou características de diferentes paradigmas, incluindo orientação a objetos e programação funcional
Scala (2004)
↓ combina orientação a objetos e programação funcional

Paradigmas representados
FORTRAN: imperativo/procedural
ALGOL 60: imperativo/procedural
C: imperativo/procedural
C++: orientado a objetos
Java: orientado a objetos
JavaScript: multiparadigma
Python: multiparadigma
Scala: funcional + orientado a objetos