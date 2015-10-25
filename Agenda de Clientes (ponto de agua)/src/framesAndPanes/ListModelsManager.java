package framesAndPanes;

import java.util.Locale;

import javax.swing.DefaultListModel;

public class ListModelsManager<T> {
	private DefaultListModel<T> originalList, searchList;

	private DefaultListModel<T> currentList;

	public ListModelsManager() {
		originalList = new DefaultListModel<T>();
		this.currentList = originalList;
	}

	public DefaultListModel<T> getOriginalList() {
		return originalList;
	}

	public DefaultListModel<T> getListModel() {
		return currentList;
	}

	@SuppressWarnings("unchecked")
	public DefaultListModel<T> searchListModel(String nameToFind) {

		if (!nameToFind.equals("")) {
			searchList = new DefaultListModel<T>();
			
			for (Object e : originalList.toArray()) {
				String lowerElement = e.toString().toLowerCase();
				if (lowerElement.contains(nameToFind.toLowerCase(Locale.ROOT))) {
					searchList.addElement((T) e);
				}
			}

			currentList = searchList;
		} else {
			currentList = originalList;
		}

		return currentList;
	}

	public void addInModel(T tElement) {
		originalList.addElement(tElement);
	}

}
