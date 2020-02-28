package com.example.form;

import javax.validation.constraints.NotBlank;

public class CommentForm {

		/**id*/
		private String articleId;
		
		/**コンテンツ*/
		@NotBlank(message="コメントを入力してください")
		private String content;
		
		/**名前*/
		@NotBlank(message="名前は必須です")
		private String name;

		public String getArticleId() {
			return articleId;
		}

		public void setArticleId(String articleId) {
			this.articleId = articleId;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

}
