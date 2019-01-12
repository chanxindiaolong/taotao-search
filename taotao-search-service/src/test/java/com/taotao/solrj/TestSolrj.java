package com.taotao.solrj;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class TestSolrj {

		@Test
		public void testAddDocument() throws Exception {
			SolrServer solrServer = new HttpSolrServer("http://192.168.25.154:8080/solr/collection1");
			SolrInputDocument document = new SolrInputDocument();
			document.addField("id", "test01");
			document.addField("item_title", "测试商品1");
			document.addField("item_price", 1000);
			
			solrServer.add(document);
			solrServer.commit();
		}
		
		@Test
		public void deleteDocumentById() throws Exception{
			SolrServer solrServer = new HttpSolrServer("http://192.168.25.154:8080/solr/collection1");
			solrServer.deleteById("test01");
			solrServer.commit();
		}
}
