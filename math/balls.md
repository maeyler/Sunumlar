<style>
  body { 
    max-width: 550px; 
    background: #dff;
  }
</style>


## Çarpışan Toplar

Önce bütün denklemleri yazıp sonra etrafını doldurmak daha kolay olabilirdi. Tam tersini yaptım: Metni silip içindeki denklemleri düzenledim. Sadece 6 adet '$$' var, biri hariç hepsi _matrix_ kullanıyor.

### Tek boyutlu çarpışma

Sonuç şöyle yazılınca hem sağlaması daha kolay olur, hem de genel formülün özel hali olarak okunabilir:
$$ \begin{matrix} 
  v'_1 = v_1 + m_2 k \Delta v, \quad v'_2 = v_2 − m_1 k \Delta v \\[8px] 
  k = 2/(m_1 + m_2), \quad \Delta v = (v_2 − v_1) 
\end{matrix} $$


### İki boyut, eşit kütleler

İzdüşüm hesabı lineer cebirin en temel konularından biridir:
$$ \mathbf{a_x} = \frac {\langle\mathbf{a}, \mathbf{x}\rangle}{\langle\mathbf{x}, \mathbf{x}\rangle} \mathbf{x} \quad \textit{projection of } \mathbf{a} \textit{ on } \mathbf{x} $$
Çarpışma problemine uygulayınca, iki topun hız farkının $\Delta \mathbf{x}$ üstüne izdüşümünden şu sonuca varılır:
$$ \begin{matrix} 
  \mathbf{v}'_1 = \mathbf{v}_1 + P \Delta \mathbf{x}, \quad \mathbf{v}'_2 = \mathbf{v}_2 − P \Delta \mathbf{x} \\[8px]
  P = \frac {\langle\Delta \mathbf{v}, \Delta \mathbf{x}\rangle} {\langle\Delta \mathbf{x}, \Delta \mathbf{x}\rangle} = \langle\Delta \mathbf{v}, \Delta \mathbf{x}\rangle / \lVert \Delta \mathbf{x}\rVert^2 \\[8px]
  \Delta \mathbf{v} = (\mathbf{v}_2 − \mathbf{v}_1), \quad \Delta \mathbf{x} = (\mathbf{x}_2 − \mathbf{x}_1)
\end{matrix} $$

Enerji hesabı için hız vektörlerinin uzunluğu gerekiyor:
$$ \begin{matrix} 
  \lVert \mathbf{v}'_1\rVert^2 = \lVert \mathbf{v}_1\rVert^2 + 2P \langle \mathbf{v}_1, \Delta \mathbf{x}\rangle + P^2 \lVert \Delta\mathbf{x}\rVert^2 \\[8px] 
  \lVert \mathbf{v}'_2\rVert^2 = \lVert \mathbf{v}_2\rVert^2 - 2P \langle \mathbf{v}_2, \Delta \mathbf{x}\rangle + P^2 \lVert \Delta\mathbf{x}\rVert^2 
\end{matrix} $$


### Genel çözüm

Karmaşık görünen bu çözüm şöyle yazılınca epeyce basitleşir:
$$ \begin{matrix} 
  \mathbf{v}'_1 = \mathbf{v}_1 + m_2 k P \Delta \mathbf{x} \\[8px]
  \mathbf{v}'_2 = \mathbf{v}_2 − m_1 k P \Delta \mathbf{x} \\[8px]
  k = 2/(m_1 + m_2),  \quad P = \langle\Delta \mathbf{v}, \Delta \mathbf{x}\rangle / \lVert \Delta \mathbf{x}\rVert^2 \\[8px]
  \Delta \mathbf{v} = (\mathbf{v}_2 − \mathbf{v}_1), \quad \Delta \mathbf{x} = (\mathbf{x}_2 − \mathbf{x}_1)
\end{matrix} $$

Bu genel çözümün iki farklı özel halini yukarıda incelemiştik:
$$ \begin{matrix} 
  \textit{Tek boyut} & \textit{Eşit kütleler} \\ 
  v'_1 = v_1 + m_2 k \Delta v & \mathbf{v}'_1 = \mathbf{v}_1 + P \Delta \mathbf{x} \\ 
  v'_2 = v_2 − m_1 k \Delta v & \mathbf{v}'_2 = \mathbf{v}_2 − P \Delta \mathbf{x} \\[10px] 
  k = 2/(m_1 + m_2) & \quad P = \langle\Delta \mathbf{v}, \Delta \mathbf{x}\rangle / \lVert \Delta \mathbf{x}\rVert^2
\end{matrix} $$

https://matemacik.blogspot.com/2020/06/carpsan-toplar.html TeX
https://matemacik.blogspot.com/p/carpsan-toplar.html  Düz metin

<script>
  inlineMath = [['$', '$'], ['\\(', '\\)']]
  MathJax = {tex: {inlineMath}}
</script>
<script id="MathJax-script" async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
