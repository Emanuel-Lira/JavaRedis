package com.produtos.produtoscache.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Cacheable(value = "produtos", key = "#id")
    public Optional<Produto> buscarPorId(Long id){
        return produtoRepository.findById(id);
    }

    @CacheEvict(value = "produtos", key = "#id")
    public Produto atualizarPreco(Long id, BigDecimal novoPreco) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Não foi possivel encontrar o produto para o id: " + id));

        produto.setPreco(novoPreco);
        return produtoRepository.save(produto);


    }
}
