<style>
  body { 
    max-width: 550px; 
    background: #dff;
  }
</style>


## GitHub içinde TeX

Matematik ifadeleri kitap kalitesinde yazmanın en kolay yolu TeX, şimdi GitHub sayfalarında... MD (markdown) formatında birkaç örnek:

• Quadratic Formula -- [github blog](https://github.blog/2022-05-19-math-support-in-markdown)

$$ \text{Solutions of } (ax^2 + bx + c = 0) \text{ if } a \ne 0 $$

$$ x = {-b \pm \sqrt{b^2-4ac} \over 2a} $$

$$ \text{note that as } a \to 0, \hspace{10px} x \to (-c/b) $$


• Cauchy -- [github docs](https://docs.github.com/en/get-started/writing-on-github/working-with-advanced-formatting/writing-mathematical-expressions)

$$\left( \sum_{k=1}^n a_k b_k \right)^2 \leq \left( \sum_{k=1}^n a_k^2 \right) \left( \sum_{k=1}^n b_k^2 \right) $$

$$ \large f(a) = \frac{1}{2\pi i} \oint\frac{f(z)}{z-a}dz $$

• Inline math -- with `$` or `\(`

use dollar sign:  $\sin(n\pi) = 0 \quad$  OK

use backslash: \(\sqrt{3x-1}+x^2 \quad\) fails

• Cosine sum -- [MathJax](https://www.mathjax.org/#samples)

$$ \cos(\theta+\phi)=\cos(\theta)\cos(\phi)−\sin(\theta)\sin(\phi) $$

TeX formülü için bağlam menüsünü kullanın <br>
(mouse varsa sağ tıklayın, yoksa basılı tutun) <br>
![sample image](./image/MathJax%20menu.png)

<pre><b>TeX input:</b>
\cos(\theta+\phi)=\cos(\theta)\cos(\phi)−\sin(\theta)\sin(\phi)

\text{Solutions of } (ax^2 + bx + c = 0) \text{ if } a \ne 0
x = {-b \pm \sqrt{b^2-4ac} \over 2a}
\text{note that as } a \to 0, \hspace{10px} x \to (-c/b)

\left( \sum_{k=1}^n a_k b_k \right)^2 \leq 
    \left( \sum_{k=1}^n a_k^2 \right) \left( \sum_{k=1}^n b_k^2 \right)
\large f(a) = \frac{1}{2\pi i} \oint\frac{f(z)}{z-a}dz
</pre>


<script>
  inlineMath = [['$', '$'], ['\\(', '\\)']]
  MathJax = {tex: {inlineMath}}
</script>
<script id="MathJax-script" async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
