//package com.testweb.testLucence;
//
//import org.apache.lucene.analysis.Analyzer;
//import org.apache.lucene.analysis.standard.StandardAnalyzer;
//import org.apache.lucene.document.Document;
//import org.apache.lucene.document.Field;
//import org.apache.lucene.document.StringField;
//import org.apache.lucene.document.TextField;
//import org.apache.lucene.index.DirectoryReader;
//import org.apache.lucene.index.IndexWriter;
//import org.apache.lucene.index.IndexWriterConfig;
//import org.apache.lucene.queryparser.classic.ParseException;
//import org.apache.lucene.queryparser.classic.QueryParser;
//import org.apache.lucene.search.IndexSearcher;
//import org.apache.lucene.search.Query;
//import org.apache.lucene.search.ScoreDoc;
//import org.apache.lucene.store.Directory;
//import org.apache.lucene.store.RAMDirectory;
//import org.apache.lucene.util.Version;
//
//import java.io.IOException;
//
//public class TestLucence {
//	
//	public static void main(String arg[]) throws IOException, ParseException{
//		//demo();
//		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_4_0);
//		Directory directory = new RAMDirectory();
//		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_4_0,analyzer);
//		IndexWriter iWriter = new IndexWriter(directory, config);
//		Document doc = new Document();
//		doc.add(new StringField("id","1234",Field.Store.YES));
//	}
//	
//	public static void demo() throws IOException, ParseException{
//		Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_CURRENT);
//	       // Store the index in memory:
//		   Directory directory = new RAMDirectory();
//		   // To store an index on disk, use this instead:
//		   //Directory directory = FSDirectory.open("/tmp/testindex");
//		   IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_CURRENT, analyzer);
//		   IndexWriter iwriter = new IndexWriter(directory, config);
//		   Document doc = new Document();
//		   String text = "This is the text to be indexed.";
//		   doc.add(new Field("fieldname", text, TextField.TYPE_STORED));
//		   iwriter.addDocument(doc);
//		   iwriter.close();
//		   
//		   // Now search the index:
//		   DirectoryReader ireader = DirectoryReader.open(directory);
//		   IndexSearcher isearcher = new IndexSearcher(ireader);
//		   // Parse a simple query that searches for "text":
//		   QueryParser parser = new QueryParser(Version.LUCENE_CURRENT, "fieldname", analyzer);
//		   Query query = parser.parse("text");
//		   ScoreDoc[] hits = isearcher.search(query, null, 1000).scoreDocs;
//		   System.out.println("hits.length = "+hits.length);
//		   // Iterate through the results:
//		   for (int i = 0; i < hits.length; i++) {
//		     Document hitDoc = isearcher.doc(hits[i].doc);
//		     System.out.println("This is the text to be indexed. "+hitDoc.get("fieldname"));
//		   }
//		   ireader.close();
//		   directory.close();
//	}
//}
//abstract class a{
//	
//}
