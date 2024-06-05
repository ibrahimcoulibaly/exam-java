package services;

import repositories.ModuleRepository;

import java.util.List;

import entities.Module;

public class ModuleService {
    private ModuleRepository moduleRepository=new ModuleRepository();


    public void ajouterUnModule(Module module) {
        moduleRepository.insert(module);
    }
     public List<Module> listerModule(){
      return moduleRepository.selectAll();
   }
}
