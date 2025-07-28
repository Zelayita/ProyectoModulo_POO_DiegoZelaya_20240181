package DiegoZelaya_20240181.DiegoZelaya_20240181.Service;

import DiegoZelaya_20240181.DiegoZelaya_20240181.Entites.EntitesProveedor;
import DiegoZelaya_20240181.DiegoZelaya_20240181.Models.DTO.DTOProvedor;
import DiegoZelaya_20240181.DiegoZelaya_20240181.Repositories.RepositorioProveedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceProveedor {
    @Autowired
    private RepositorioProveedor repo;

    public List<DTOProvedor> getAllusers(){
        List<EntitesProveedor> provider = repo.findAll();
        return provider.stream()
                .map(this::ConvertirAProviderDTO)
                .collect(Collectors.toList());
    }

    private DTOProvedor ConvertirAProviderDTO(EntitesProveedor entity) {
        DTOProvedor dto = new DTOProvedor();
        dto.setProviderID(entity.getProviderID());
        dto.setProviderName(entity.getProviderName());
        dto.setProviderPhone(entity.getProviderPhone());
        dto.setProviderAddress(entity.getProviderAddress());
        dto.setEmail(entity.getEmail());
        dto.setProviderCode(entity.getProviderCode());
        dto.setProviderStatus(entity.getProviderStatus());
        dto.setProviderComments(entity.getProviderComments());
        return dto;
    }
}
