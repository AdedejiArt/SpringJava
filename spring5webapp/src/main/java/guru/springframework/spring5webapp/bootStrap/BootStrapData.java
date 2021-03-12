package guru.springframework.spring5webapp.bootStrap;

import guru.springframework.spring5webapp.domain.Agents;
import guru.springframework.spring5webapp.domain.Customers;
import guru.springframework.spring5webapp.domain.Houses;
import guru.springframework.spring5webapp.domain.Lands;
import guru.springframework.spring5webapp.repositories.AgentsRepository;
import guru.springframework.spring5webapp.repositories.CustomersRepository;
import guru.springframework.spring5webapp.repositories.HousesRepository;
import guru.springframework.spring5webapp.repositories.LandsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final HousesRepository housesRepository;
    private final CustomersRepository customersRepository;
    private final AgentsRepository agentsRepository;
    private final LandsRepository landsRepository;


    public BootStrapData (HousesRepository housesRepository,CustomersRepository customersRepository,AgentsRepository agentsRepository,LandsRepository landsRepository){
     this.housesRepository=housesRepository;
     this.agentsRepository=agentsRepository;
     this.customersRepository=customersRepository;
     this.landsRepository=landsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Houses Duplex=new Houses("001","Lagos","ValleyView");
        Agents Apexview=new Agents("001","ApexView Consultancy");
        Customers Adio=new Customers("001","Adio","Adedeji");
        Lands Ajah=new Lands("001","Ajah","RoyalViewLands");

         Adio.getHouses().add(Duplex);
         Adio.getLands().add(Ajah);

         housesRepository.save(Duplex);
         agentsRepository.save(Apexview);
         customersRepository.save(Adio);

         System.out.println(housesRepository.count());


    }
}
