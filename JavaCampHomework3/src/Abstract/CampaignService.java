package Abstract;

import Entity.Campaign;

public interface CampaignService {
	void campaignAdd(Campaign campaign,int id, String Name, int Rate);
	void campaignUpdate(Campaign campaign,String name, int Rate);
	void campaignDelete(Campaign campaign);

}
