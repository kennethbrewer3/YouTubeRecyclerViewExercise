package com.mobileappscompany.training.youtuberecyclerviewexercise;
import android.content.Context;

import com.mobileappscompany.training.youtuberecyclerviewexercise.web.JSONServiceClient;
import com.mobileappscompany.training.youtuberecyclerviewexercise.web.JSONServiceClientImpl;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

/**
 * Created by Android1 on 5/4/2015.
 */
@RunWith(RobolectricTestRunner.class)
public class JSonServiceClientTest {

    private MainActivity activity;

    @Test
    public void shouldHaveHappySmiles() throws Exception {
        Context context = new MainActivity().getBaseContext();
        JSONServiceClient client = new JSONServiceClientImpl(context,"https://gdata.youtube.com/feeds/api/videos?q=sugar+ray+robinson&orderby=published&start-index=1&max-results=10&v=2&alt=jsonc");
        assertEquals(jsonString,client.getData());
    }

    private final String jsonString = "{\"apiVersion\":\"2.1\",\"data\":{\"updated\":\"2015-04-21T03:14:57.577Z\",\"totalItems\":105767,\"startIndex\":1,\"itemsPerPage\":10,\"items\":[{\"id\":\"UKY3scPIMd8\",\"uploaded\":\"2015-04-17T15:23:22.000Z\",\"updated\":\"2015-04-21T03:14:24.000Z\",\"uploader\":\"youtubehelp\",\"category\":\"Howto\",\"title\":\"https://youtube.com/devicesupport\",\"description\":\"\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/UKY3scPIMd8/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/UKY3scPIMd8/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=UKY3scPIMd8&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=UKY3scPIMd8\"},\"content\":{\"5\":\"https://www.youtube.com/v/UKY3scPIMd8?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r1---sn-p5qlsu76.c.youtube.com/CiILENy73wIaGQnfMcjDsTemUBMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r1---sn-p5qlsu76.c.youtube.com/CiILENy73wIaGQnfMcjDsTemUBMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":236,\"aspectRatio\":\"widescreen\",\"viewCount\":449342,\"favoriteCount\":0,\"accessControl\":{\"comment\":\"denied\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"denied\",\"embed\":\"allowed\",\"list\":\"denied\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"YLSFCgz5wyk\",\"uploaded\":\"2015-04-21T00:00:41.000Z\",\"updated\":\"2015-04-21T03:05:23.000Z\",\"uploader\":\"L8G5QpVY7C9MEGmhaotDVw\",\"category\":\"Sports\",\"title\":\"Floyd Mayweather Says He Is Greater Than Muhammad Ali & Sugar Ray Robinson AGAIN ESPN First Take\",\"description\":\"AGAIN Floyd Mayweather Says He Is Greater Than Muhammad Ali & Sugar Ray Robinson !!! WTF ??\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/YLSFCgz5wyk/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/YLSFCgz5wyk/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=YLSFCgz5wyk&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=YLSFCgz5wyk\"},\"content\":{\"5\":\"https://www.youtube.com/v/YLSFCgz5wyk?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r1---sn-p5qlsu7r.c.youtube.com/CiILENy73wIaGQkpw_kMCoW0YBMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r1---sn-p5qlsu7r.c.youtube.com/CiILENy73wIaGQkpw_kMCoW0YBMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":2407,\"rating\":4.6989245,\"likeCount\":\"86\",\"ratingCount\":93,\"viewCount\":301,\"favoriteCount\":0,\"commentCount\":85,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"AB-x9Xz6Q0s\",\"uploaded\":\"2015-04-20T22:43:09.000Z\",\"updated\":\"2015-04-20T23:47:54.000Z\",\"uploader\":\"pYGNm__HzXWqin_wA2S0ag\",\"category\":\"Sports\",\"title\":\"Floyd Mayweather Jr. Says He's Better Than Muhammad Ali & Sugar Ray Robinson\",\"description\":\"Is It TRUE? Floyd Mayweather Jr. Tells Stephen A. Smith He's Better Than Muhammad Ali & Sugar Ray Robinson On Espn First Take. Thoughts? #SUBSCRIBE Full Video Here: https://youtu.be/nUs...\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/AB-x9Xz6Q0s/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/AB-x9Xz6Q0s/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=AB-x9Xz6Q0s&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=AB-x9Xz6Q0s\"},\"content\":{\"5\":\"https://www.youtube.com/v/AB-x9Xz6Q0s?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r5---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQlLQ_p89bEfABMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r5---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQlLQ_p89bEfABMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":440,\"aspectRatio\":\"widescreen\",\"rating\":3.857143,\"likeCount\":\"10\",\"ratingCount\":14,\"viewCount\":38,\"favoriteCount\":0,\"commentCount\":5,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"b-c3bl5UD5w\",\"uploaded\":\"2015-04-20T21:14:28.000Z\",\"updated\":\"2015-04-20T21:14:28.000Z\",\"uploader\":\"tPI_KvjqJzPRzFRJHq1aWg\",\"category\":\"Sports\",\"title\":\"Espn First Take- Floyd Mayweather: Bitch I'm Better Than Muhammad Ali and Sugar Ray Robinson\",\"description\":\"Espn First Take- Floyd Mayweather: Bitch I'm Better Than Muhammad Ali and Sugar Ray Robinson. Espn First Take- Floyd Mayweather: Bitch I'm Better Than Muhammad Ali and Sugar Ray Robinson ...\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/b-c3bl5UD5w/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/b-c3bl5UD5w/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=b-c3bl5UD5w&feature=youtube_gdata_player\"},\"content\":{\"5\":\"https://www.youtube.com/v/b-c3bl5UD5w?version=3&f=videos&app=youtube_gdata\"},\"duration\":1161,\"aspectRatio\":\"widescreen\",\"commentCount\":0,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"figS0qbzbC0\",\"uploaded\":\"2015-04-20T21:09:57.000Z\",\"updated\":\"2015-04-21T01:36:43.000Z\",\"uploader\":\"darealfewchainz\",\"category\":\"Sports\",\"title\":\"Espn First Take- Floyd Mayweather: Bitch I'm Better Than Muhammad Ali and Sugar Ray Robinson\",\"description\":\"Espn First Take- Floyd Mayweather: Bitch I'm Better Than Muhammad Ali and Sugar Ray Robinson.\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/figS0qbzbC0/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/figS0qbzbC0/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=figS0qbzbC0&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=figS0qbzbC0\"},\"content\":{\"5\":\"https://www.youtube.com/v/figS0qbzbC0?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r4---sn-p5qlsu7s.c.youtube.com/CiILENy73wIaGQktbPOm0hIofhMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r4---sn-p5qlsu7s.c.youtube.com/CiILENy73wIaGQktbPOm0hIofhMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":801,\"aspectRatio\":\"widescreen\",\"rating\":3.0,\"likeCount\":\"1\",\"ratingCount\":2,\"viewCount\":148,\"favoriteCount\":0,\"commentCount\":1,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"GNe9Vq76CBo\",\"uploaded\":\"2015-04-20T19:57:31.000Z\",\"updated\":\"2015-04-21T02:37:24.000Z\",\"uploader\":\"egosworld1\",\"category\":\"Sports\",\"title\":\"FLOYD MAYWEATHER THINKS HE'S BETTER THAN MUHAMMAD ALI & SUGAR RAY ROBINSON--TBE\",\"description\":\"Floyd Mayweather Vs. Sugar Ray Robinson and Muhammad Ali arguments. Mayweather argues why he believes he's better than them, even though they paved the way for him. Floyd Mayweather on ...\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/GNe9Vq76CBo/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/GNe9Vq76CBo/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=GNe9Vq76CBo&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=GNe9Vq76CBo\"},\"content\":{\"5\":\"https://www.youtube.com/v/GNe9Vq76CBo?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r5---sn-p5qlsu76.c.youtube.com/CiILENy73wIaGQkaCPquVr3XGBMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r5---sn-p5qlsu76.c.youtube.com/CiILENy73wIaGQkaCPquVr3XGBMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":514,\"aspectRatio\":\"widescreen\",\"rating\":4.0215826,\"likeCount\":\"105\",\"ratingCount\":139,\"viewCount\":1240,\"favoriteCount\":0,\"commentCount\":217,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"tiSQuVl4EHs\",\"uploaded\":\"2015-04-20T19:56:22.000Z\",\"updated\":\"2015-04-20T20:56:46.000Z\",\"uploader\":\"vT022j8qZ768Eyot14Oz7w\",\"category\":\"Entertainment\",\"title\":\"Floyd Mayweather Jr. Argues That He's Better Than Muhammad Ali!\",\"description\":\"Floyd Mayweather Jr. Argues That He's Better Than Muhammad Ali! Floyd Mayweather says he's better than Muhammad Ali Floyd Mayweather Jr. Explains Why He's Better Than Muhammad Ali FLOYD ...\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/tiSQuVl4EHs/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/tiSQuVl4EHs/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=tiSQuVl4EHs&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=tiSQuVl4EHs\"},\"content\":{\"5\":\"https://www.youtube.com/v/tiSQuVl4EHs?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r6---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQl7EHhZuZAkthMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r6---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQl7EHhZuZAkthMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":107,\"aspectRatio\":\"widescreen\",\"rating\":5.0,\"likeCount\":\"5\",\"ratingCount\":5,\"viewCount\":301,\"favoriteCount\":0,\"commentCount\":0,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"Ipx7UuUzYNg\",\"uploaded\":\"2015-04-20T18:13:22.000Z\",\"updated\":\"2015-04-20T22:08:11.000Z\",\"uploader\":\"dtNjOwfQpgVK0FyOeLyzrg\",\"category\":\"Sports\",\"title\":\"Floyd Mayweather vs Sugar Ray Robinson � Who Wins ?\",\"description\":\"Sugar Ray Robinson and Floyd Mayweather meet for the Welterweight Crown. Robinson scored 108 knockouts in his 25 year career. Floyd is acknowledged as one of the greatest defensive fighters...\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/Ipx7UuUzYNg/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/Ipx7UuUzYNg/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=Ipx7UuUzYNg&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=Ipx7UuUzYNg\"},\"content\":{\"5\":\"https://www.youtube.com/v/Ipx7UuUzYNg?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r5---sn-p5qlsu76.c.youtube.com/CiILENy73wIaGQnYYDPlUnucIhMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r5---sn-p5qlsu76.c.youtube.com/CiILENy73wIaGQnYYDPlUnucIhMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":105,\"aspectRatio\":\"widescreen\",\"rating\":5.0,\"likeCount\":\"38\",\"ratingCount\":38,\"viewCount\":239,\"favoriteCount\":0,\"commentCount\":32,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"7nVTRH-29aM\",\"uploaded\":\"2015-04-20T06:50:47.000Z\",\"updated\":\"2015-04-20T19:07:09.000Z\",\"uploader\":\"boxinghof\",\"category\":\"Sports\",\"title\":\"Floyd Mayweather vs Sugar Ray Robinson � Who Wins ?\",\"description\":\"Sugar Ray Robinson and Floyd Mayweather meet for the Welterweight Crown. Robinson scored 108 knockouts in his 25 year career. Floyd is acknowledged as one of the greatest defensive fighters...\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/7nVTRH-29aM/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/7nVTRH-29aM/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=7nVTRH-29aM&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=7nVTRH-29aM\"},\"content\":{\"5\":\"https://www.youtube.com/v/7nVTRH-29aM?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r4---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQmj9bZ_RFN17hMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r4---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQmj9bZ_RFN17hMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":100,\"aspectRatio\":\"widescreen\",\"rating\":3.857143,\"likeCount\":\"10\",\"ratingCount\":14,\"viewCount\":180,\"favoriteCount\":0,\"commentCount\":10,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}},{\"id\":\"dCYu5Qfjz0I\",\"uploaded\":\"2015-04-17T14:06:57.000Z\",\"updated\":\"2015-04-17T14:48:45.000Z\",\"uploader\":\"tF0e0l2NNvQQOGtsK-OrUg\",\"category\":\"Sports\",\"title\":\"Ray Mercer vs Tim Witherspoon (Highlights)\",\"description\":\"NO COPYRIGHT INFRINGEMENT INTENDED ** Highlights of good fight between \\\"Merciless\\\" Ray Mercer and \\\"Terrible\\\" Tim Witherspoon. ** Greatest Fighters - Sugar Ray Robinson, Sam Langford, Joe ...\",\"thumbnail\":{\"sqDefault\":\"https://i.ytimg.com/vi/dCYu5Qfjz0I/default.jpg\",\"hqDefault\":\"https://i.ytimg.com/vi/dCYu5Qfjz0I/hqdefault.jpg\"},\"player\":{\"default\":\"https://www.youtube.com/watch?v=dCYu5Qfjz0I&feature=youtube_gdata_player\",\"mobile\":\"https://m.youtube.com/details?v=dCYu5Qfjz0I\"},\"content\":{\"5\":\"https://www.youtube.com/v/dCYu5Qfjz0I?version=3&f=videos&app=youtube_gdata\",\"1\":\"rtsp://r3---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQlCz-MH5S4mdBMYDSANFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\",\"6\":\"rtsp://r3---sn-p5qlsu7k.c.youtube.com/CiILENy73wIaGQlCz-MH5S4mdBMYESARFEgGUgZ2aWRlb3MM/0/0/0/video.3gp\"},\"duration\":276,\"commentCount\":0,\"accessControl\":{\"comment\":\"allowed\",\"commentVote\":\"allowed\",\"videoRespond\":\"moderated\",\"rate\":\"allowed\",\"embed\":\"allowed\",\"list\":\"allowed\",\"autoPlay\":\"allowed\",\"syndicate\":\"allowed\"}}]}}";
}
