package Abstract;

import Entity.Campaign;

public class BaseCampaignManager implements CampaignService {

	@Override
	public void campaignAdd(Campaign campaign,int id, String Name, int Rate) {
		campaign.setCampaignID(id);
		campaign.setCampaignName(Name);
		campaign.setCampaignRate(Rate);
	
		System.out.println("<-------- "+ campaign.getCampaignName() + " Eklendi -------->");
	}
	@Override
	public void campaignUpdate(Campaign campaign, String Name,int Rate) {
		campaign.setCampaignName(Name);
		campaign.setCampaignRate(Rate);
		System.out.println("<-------- "+ campaign.getCampaignName()+ " ve indirim oraný "+ " Güncellendi -------->");
	}
	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("<-------- "+ campaign.getCampaignName() + " Silindi -------->");
	}
}
