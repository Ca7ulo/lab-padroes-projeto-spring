package one.digitalInovation.gof.service;

import one.digitalInovation.gof.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

        @Autowired

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")

    Endereco consultarCep(@PathVariable("cep")String cep);
}

