package Design11FacedeDesign.Hukuksal;

import java.util.List;

public class HukuksalControlService {
    private HukuksalSurecEntityService hukuksalSurecEntityService;

    public HukuksalControlService(HukuksalSurecEntityService hukuksalSurecEntityService) {
        this.hukuksalSurecEntityService = hukuksalSurecEntityService;
    }

    public boolean isHukuksalIslem(Long borcId){
        List<Long> hukuksalIslemBorcList = hukuksalSurecEntityService.findAllHukuksalIslem();
        boolean ishukuksalIslemde=hukuksalIslemBorcList.contains(borcId);
        if(ishukuksalIslemde){
            System.out.println("Borc Hukuksal işlemde. Tahsil edilemedi");
        }
        return  ishukuksalIslemde;

    }
}
