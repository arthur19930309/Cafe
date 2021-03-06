package ua.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import ua.entity.Ingredient;
import ua.repository.IngredientRepository;

@Component
public class IngredientConverter implements Converter<String, Ingredient> {

	private final IngredientRepository repository;

	public IngredientConverter(IngredientRepository repository) {
		this.repository = repository;
	}

	@Override
	public Ingredient convert(String source) {
		return repository.findByName(source);
	}

}