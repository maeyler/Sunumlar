## GitHub içinde TeX

Matematik formüllerini kitap kalitesinde yazmanın en kolay yolu TeX, şimdi GitHub içinde. MD (markdown) formatında birkaç örnek:

* Quadratic Formula -- [github blog](https://github.blog/2022-05-19-math-support-in-markdown)

$$ \text{When } a \ne 0 \text{, two solutions of } (ax^2 + bx + c = 0) \text{:  } $$

$$ x = {-b \pm \sqrt{b^2-4ac} \over 2a} $$


* Cauchy-Schwarz Inequality -- [github docs](https://docs.github.com/en/get-started/writing-on-github/working-with-advanced-formatting/writing-mathematical-expressions)

$$\left( \sum_{k=1}^n a_k b_k \right)^2 \leq \left( \sum_{k=1}^n a_k^2 \right) \left( \sum_{k=1}^n b_k^2 \right)$$


* Cauchy's Integral -- [MathJax](https://www.mathjax.org/#samples)

$$ \large f(a) = \frac{1}{2\pi i} \oint\frac{f(z)}{z-a}dz $$

* Cosine sum -- [MathJax](https://www.mathjax.org/#samples)

$$ \cos(\theta+\phi)=\cos(\theta)\cos(\phi)−\sin(\theta)\sin(\phi) $$

TeX formülünü görmek için bağlam menüsünü kullanın <br>
(mouse varsa sağ tıklayın, yoksa parmağı basılı tutun) <br>
![sample image](./image/MathJax%20menu.png)

<pre>
\cos(\theta+\phi)=\cos(\theta)\cos(\phi)−\sin(\theta)\sin(\phi)
</pre>

<style>
  body { 
    max-width: 500px; 
    background: #dff;
  }
</style>

<script id="MathJax-script" async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
